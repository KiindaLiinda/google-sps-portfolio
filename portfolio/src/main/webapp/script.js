// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
  const greetings =
      ['Hello world!', '¡Hola Mundo!', '你好，世界！', 'Bonjour le monde!'];

  // Pick a random greeting.
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}

//The following code is from Week 2 -------------------------

async function myServlet() {
  const responseFromServer = await fetch('/myservlet');
  const textFromResponse = await responseFromServer.text();

  const myServletMessage = document.getElementById('my-servlet');
  myServletMessage.innerText = textFromResponse;
}

//The following code is from Week 3
google.charts.load('current', {
  'packages':['geochart'],
  // Note: you will need to get a mapsApiKey for your project.
  // See: https://developers.google.com/chart/interactive/docs/basic_load_libs#load-settings
  'mapsApiKey': 'AIzaSyAnS-PCXsJQBbt2IESQu_0ne7uKBb-DxX0'
  });
  google.charts.setOnLoadCallback(drawMarkersMap);

  function drawMarkersMap() {
      var data = google.visualization.arrayToDataTable([
        ['City',   'Information'],
        ['Los Angeles',  'This Is The City I Am From'],
        ['Merced',  'This Is The City I Attend College'],
        ['Jerez',  'This Is The City My Father Is From'],
        ['Tlazazalca',  'This Is The City My Mother Is From']
      ]);
      

      var options = {
        region: 'IT',
        displayMode: 'markers',
        colorAxis: {colors: ['red', 'blue']}
      };

      var chart = new google.visualization.GeoChart(document.getElementById('regions_div'));

      chart.draw(data, options);
  }