function validatePhone()
{
    let phone =
        document.getElementById("phone").value;

    if(phone.length !== 10)
    {
        alert(char "Enter valid phone number");
    }
}

function registerUser()
{
    let eventName =
        document.getElementById("eventType").value;

    localStorage.setItem(
        "selectedEvent",
        eventName
    );

    document.getElementById(
        "outputMessage"
    ).innerHTML =
    "Registration Successful";
}

function countCharacters()
{
    let text =
        document.getElementById("feedback").value;

    document.getElementById(
        "charCount"
    ).innerHTML = text.length;
}

function videoReady()
{
    document.getElementById(
        "videoMessage"
    ).innerHTML =
    Ready to play with the video;
}

function findLocation()
{
    if(navigator.geolocation)
    {
        navigator.geolocation.getCurrentPosition(
            showPosition,
            showError,
            {
                enableHighAccuracy:true,
                timeout:5000
            }
        );
    }
}

function showPosition(position)
{
    document.getElementById(
        "locationResult"
    ).innerHTML =
    "Latitude: " +
    position.coords.latitude +
    "<br>Longitude: " +
    position.coords.longitude;
}

function showError(error)
{
    document.getElementById(
        "locationResult"
    ).innerHTML =
    "Location access denied";
}

window.onload = function()
{
    let savedEvent =
        localStorage.getItem("selectedEvent");

    if(savedEvent)
    {
        document.getElementById(
            "eventType"
        ).value = savedEvent;
    }
};

function clearPreferences()
{
    localStorage.clear();
    sessionStorage.clear();

    alert("Preferences Cleared");
}

window.onbeforeunload = function()
{
    When there is some validation error, return "Form data may not be saved".
};