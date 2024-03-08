document.addEventListener("DOMContentLoaded", function () {
    // Get DOM elements
    const submitBtn = document.getElementById("submit-btn");
    const cityInputField = document.getElementById("city-input-field");
    const tbody = document.querySelector(".weather-history-table tbody");
    const getWeatherBtn = document.getElementById("get-weather-btn");

    // Event listener for Submit button click
    submitBtn.addEventListener("click", function () {
        const cityName = cityInputField.value.trim();
        if (cityName !== "") {
            fetchWeatherData(cityName);
        } else {
            alert("Please enter a valid city name.");
        }
    });

    // Event listener for Get Weather button click
    getWeatherBtn.addEventListener("click", fetchDefaultWeather);

    // Function to fetch default weather
    function fetchDefaultWeather() {
        fetchWeatherData("sambhal"); // Default city
    }

    // Function to fetch weather data from server
    function fetchWeatherData(city) {
        const apiUrl = `http://localhost/weather.php?city=${encodeURIComponent(city)}`;
        fetch(apiUrl)
            .then(handleResponse)
            .then(handleWeatherData)
            .catch(handleError);
    }

    // Handle response from server
    function handleResponse(response) {
        if (!response.ok) {
            throw new Error("Network response was not ok");
        }
        return response.json();
    }

    // Handle weather data received from server
    function handleWeatherData(data) {
        if (data.status === "success" && data.current_weather) {
            // Store weather data in localStorage
            localStorage.setItem("current_weather", JSON.stringify(data.current_weather));
            if (data.historical_weather) {
                localStorage.setItem("historical_weather", JSON.stringify(data.historical_weather));
            }
            // Update UI with weather data
            updateCurrentWeatherUI(data.current_weather);
            updateHistoricalWeatherUI(data.historical_weather);
        } else {
            // Alert user about error
            alert(`Error: ${data.message}`);
            // If error, retrieve data from localStorage
            storedatalocal();
        }
    }

    // Handle errors occurred during fetch
    function handleError(error) {
        console.error("Error fetching data:", error);
        // If error, retrieve data from localStorage
        storedatalocal();
    }

    // Function to retrieve data from localStorage
    function storedatalocal() {
        const currentWeatherdata = localStorage.getItem("current_weather");
        const historicalWeatherdata = localStorage.getItem("historical_weather");
        if (currentWeatherdata) {
            const currentWeather = JSON.parse(currentWeatherdata);
            updateCurrentWeatherUI(currentWeather);
        }
        if (historicalWeatherdata) {
            const historicalWeather = JSON.parse(historicalWeatherdata);
            updateHistoricalWeatherUI(historicalWeather);
        }
    }

    // Function to update current weather UI
    function updateCurrentWeatherUI(currentWeather) {
        const { city_name, temperature, description, main, humidity, wind, pressure, weather_date, icon } = currentWeather;
        document.getElementById("city-header").textContent = city_name;
        document.getElementById("weather-icon").src = `https://openweathermap.org/img/wn/${icon}@2x.png`;
        document.getElementById("temperature").textContent = `${temperature} ℃`;
        document.getElementById("description").textContent = description;
        document.getElementById("main").textContent = main;
        document.getElementById("humidity").textContent = ` ${humidity}%`;
        document.getElementById("wind").textContent = ` ${wind} m/s`;
        document.getElementById("pressure").textContent = ` ${pressure} hPa`;
        document.getElementById("datetime").textContent = ` ${weather_date}`;
    }

    // Function to update historical weather UI
    function updateHistoricalWeatherUI(historicalWeather) {
        tbody.innerHTML = "";
        historicalWeather.forEach((entry) => {
            const iconUrl = `https://openweathermap.org/img/wn/${entry.icon}.png`;
            const row = document.createElement("tr");
            row.innerHTML = `
                <td><img src="${iconUrl}" alt="Weather Icon"></td>
                <td>${entry.temperature}℃</td>
                <td>${entry.description}</td>
                <td>${entry.main}</td>
                <td>${entry.humidity}%</td>
                <td>${entry.wind} m/s</td>
                <td>${entry.pressure} hPa</td>
                <td>${entry.weather_date}</td>
            `;
            tbody.appendChild(row);
        });
    }
});
