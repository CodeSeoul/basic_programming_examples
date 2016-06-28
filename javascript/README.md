# Javascript

Javascript is a highly versatile, interpreted language, usable in both web browsers and within the OS using NodeJS. It's exploded in popularity in recent times with NodeJS, Angular, React, and more along with its wide array of tooling like NPM, Bower, Grunt, and Gulp. This may all sound like gibberish for now, but these rapidly become critical tools in modern web development.

As an "interpreted" language, Javascript is run by another process that is responsible from translating the code a programmer writes into machine code that either the browser or operating system can run. Another key component of Javascript is its support for asynchronous actions, or actions that occur independently of your normal code execution path. This means you can execute logic in a "fire and forget" manner, where your main logic and the asynchronous logic run independently. This can actually be a challenge, as you cannot know when the main code path and the asynchronous code path will execute in relation to one another. For this, Javascript provides the concept of "callbacks," or functions that can be executed whenever a body of asynchronous logic completes. We'll get more into this later.

Javascript is often favored among startups for rapid prototyping and requiring knowledge of only one language for both front-end and back-end web applications.

## Advantages
* Great asynchronous support
* Works on both client and server thanks to NodeJS
* Portable due to being an interpreted language
* Lots of tooling

## Disadvantages
* Relies a great deal on asynchronous logic, which takes some getting used to
* Not 100% portable, as not all web browsers support all Javascript functions
* Dependency hell is not uncommon - you may have issues compiling certain dependencies or encounter conflicting dependencies
* Doesn't support true multi-threading
