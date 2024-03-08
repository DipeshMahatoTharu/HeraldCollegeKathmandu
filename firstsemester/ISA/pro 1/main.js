
// Dipesh Mahato Tharu
// 2408059

function myFunction() {
  getResults("Sambhal");; // Calling the getResults function with a city name "Sambhal"
}

function searchWeather() {
  let cityName = document.getElementById('cityInput').value.trim();
  if (cityName !== "") {
    getResults(cityName);
  } else {
    alert("Please enter a city name.");
  }
}

function getResults(query) {
  // Making a fetch request to the OpenWeatherMap API using the provided query
  fetch(`${"https://api.openweathermap.org/data/2.5/"}weather?q=${query}&units=metric&APPID=${"994da0339d8567da41f65c7c0cc90595"}`)
    .then(weather => {
      return weather.json(); 
    }).then(displayResults); // Calling the displayResults function with the fetched weather data
}

function displayResults(weather) {
  console.log(weather); 

  // Selecting elements in the HTML and setting their text/content based on the weather data
  let city = document.querySelector('.city');
  city.innerText = `${weather.name},${weather.sys.country}`;

  let currentTime = new Date(); 
  let date = document.querySelector('.date');
  date.innerText = dateBuilder(currentTime); 

  let temp = document.querySelector('.temp');
  temp.innerHTML = `${Math.round(weather.main.temp)}<span>°c</span>`; // Displaying temperature

  let weather_el = document.querySelector('.weather');
  weather_el.innerText = weather.weather[0].description; 

  let hilow = document.querySelector('.hi-low');
  hilow.innerText = `${Math.round(weather.main.temp_min)}°c / ${Math.round(weather.main.temp_max)}°c`; 
  let wind = document.querySelector('.wind');
  wind.innerText = weather.wind.speed + " m/s"; // Displaying wind speed

  let weatherIcon = document.querySelector('.weathericon');
  weatherIcon.src = 'http://openweathermap.org/img/w/' + weather.weather[0].icon + '.png';
}

function dateBuilder(d) {
  // Building and formatting the date to be displayed
  let months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
  let days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];

  let day = days[d.getDay()];
  let date = d.getDate(); 
  let month = months[d.getMonth()]; 
  let year = d.getFullYear(); 

  return `${day} ${date} ${month} ${year}`; // Returning formatted date string
}
