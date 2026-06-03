console.log("Welcome to the Community Portal");

window.onload = function(){

    alert("Community Portal Loaded Successfully");

    displayEvents(events);

};

const eventName = "Community Events";
const eventDate = "2026";

let availableSeats = 20;

availableSeats++;

console.log(`${eventName} ${eventDate}`);

function Event(id,name,category,location,seats){

    this.id = id;
    this.name = name;
    this.category = category;
    this.location = location;
    this.seats = seats;

}

Event.prototype.checkAvailability = function(){

    return this.seats > 0;

};

let events = [

    new Event(
        1,
        "Dance Competition",
        "Dance",
        "Community Hall",
        20
    ),

    new Event(
        2,
        "Music Night",
        "Music",
        "City Center",
        20
    ),

    new Event(
        3,
        "Singing Contest",
        "Singing",
        "Community Hall",
        20
    )

];

function displayEvents(eventList){

    let container =
        document.getElementById("eventContainer");

    container.innerHTML = "";

    eventList.forEach(function(event){

        if(event.seats <= 0){
            return;
        }

        let card =
            document.createElement("div");

        card.className = "event-card";

        card.innerHTML =

        "<h3>" + event.name + "</h3>" +

        "<p>Category : "
        + event.category +
        "</p>" +

        "<p>Location : "
        + event.location +
        "</p>" +

        "<p>Available Seats : "
        + event.seats +
        "</p>" +

        "<button onclick='registerUser("
        + event.id +
        ")'>Register</button>";

        container.appendChild(card);

    });

}

function registerUser(id){

    try{

        let found = false;

        for(let i=0;i<events.length;i++){

            if(events[i].id == id){

                found = true;

                if(events[i].seats > 0){

                    events[i].seats--;

                    alert(
                        "Registration Successful"
                    );

                }
                else{

                    throw "No Seats Available";

                }

            }

        }

        if(!found){

            throw "Event Not Found";

        }

        displayEvents(events);

    }
    catch(error){

        alert(error);

    }

}

function addEvent(
    id,
    name,
    category,
    location,
    seats
){

    let newEvent =
        new Event(
            id,
            name,
            category,
            location,
            seats
        );

    events.push(newEvent);

}

function filterEventsByCategory(category){

    let filteredEvents = [];

    events.forEach(function(event){

        if(event.category == category){

            filteredEvents.push(event);

        }

    });

    displayEvents(filteredEvents);

}

document
.getElementById("categoryFilter")
.onchange = function(){

    let category = this.value;

    if(category == "all"){

        displayEvents(events);

    }
    else{

        filterEventsByCategory(category);

    }

};

document
.getElementById("searchBox")
.addEventListener(
    "keydown",
    function(){

        let text =
        this.value.toLowerCase();

        let result = [];

        events.forEach(function(event){

            if(
                event.name
                .toLowerCase()
                .includes(text)
            ){

                result.push(event);

            }

        });

        displayEvents(result);

    }
);

function registrationCounter(){

    let total = 0;

    return function(){

        total++;

        return total;

    };

}

let countRegistrations =
registrationCounter();

console.log(
    countRegistrations()
);

console.log(
    countRegistrations()
);

let eventNames =
events.map(function(event){

    return "Event : " + event.name;

});

console.log(eventNames);

let musicEvents =
events.filter(function(event){

    return event.category == "Music";

});

console.log(musicEvents);

console.log(
    Object.entries(events[0])
);

async function fetchEvents(){

    try{

        console.log(
            "Fetching Events..."
        );

        let response =
        await fetch(
            "https://jsonplaceholder.typicode.com/posts"
        );

        let data =
        await response.json();

        console.log(data);

    }
    catch(error){

        console.log(error);

    }

}

fetchEvents();

document
.getElementById(
    "registrationForm"
)
.addEventListener(
    "submit",
    function(e){

        e.preventDefault();

        let name =
        this.elements["name"].value;

        let email =
        this.elements["email"].value;

        let selectedEvent =
        this.elements["event"].value;

        let message =
        document.getElementById(
            "message"
        );

        if(
            name == "" ||
            email == ""
        ){

            message.innerHTML =
            "Please fill all fields";

            return;

        }

        message.innerHTML =
        "Submitting Registration...";

        let userData = {

            name:name,
            email:email,
            event:selectedEvent

        };

        console.log(
            "Sending Data",
            userData
        );

        setTimeout(function(){

            fetch(
                "https://jsonplaceholder.typicode.com/posts",
                {
                    method:"POST",

                    headers:{
                        "Content-Type":
                        "application/json"
                    },

                    body:JSON.stringify(
                        userData
                    )
                }
            )
            .then(function(response){

                return response.json();

            })
            .then(function(data){

                console.log(data);

                message.innerHTML =
                "Registration Successful";

            })
            .catch(function(error){

                console.log(error);

                message.innerHTML =
                "Registration Failed";

            });

        },2000);

    }
);