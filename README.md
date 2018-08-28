
MAIN CONTENT (90 mins)

1. (1:30-1:35) Start a new project with spring init (5mins)
    * Packages
        * JPA
        * H2
        * Spring Web Starter
        * (optional) DevTools
2. (1:35-1:40) Start a new Angular project (5 mins)
    * Move into the src/main folder
    * Ng new frontend
3. (1:40-1:45) Start angular app and spring (5 mins)
    * Npm start
    * Check localhost:4200
    * Add application.properties file info
    * Check H2 link
        * Use db “testdb”
4. (1:45-1:50) Setup git (5 mins)
    * Add this file to MD
    * Add starter file
    * Initialize through VCS
    * Add gitignore idea folder
    * Add the files
5. (1:50-2:10) Seed data and db classes (20 mins)
    * Create Seeder class - see starter file
    * Create Entity - see starter file
        * Properties
        * Two constructors
        * Builder getter and setters
        * Jackson used getters
        * printString
    * Create DirectorService - see starter file
    * Create service class set for entity
    * Save new entities based off the different strings and use a lambda for factory
    * Check H2 db
6. (2:10-2:15) Create rest endpoint (5 mins)
    * Try the api through postman
    * Try through url
7. (2:15-2:20) Change tslint file (5 min)
    * Change spaces to tabs
    * Remove oneline errors
    * Add “dnd” to component selector
8. (2:20-2:25) Create the component and test it (5 min)
    * Add to module
    * Add component to app.component.html
    * Add css class to see all - see starter file
9. (2:25-2:35) Create models (10 mins)
    * CharacterSheet
    * CharaterListSubject
    * generateMockCharacterList
10. (2:35-2:45) Create mock service (10 mins)
    * ManageService
    * MockService
    * Add service to component
    * Display items
11. (2:45-2:55) Create actual service (10 mins)
    * ActualService
    * Add service to component
    * Try to display items
        * Setup the proxy - see starter file
        * Add HttpClientModule to module
12. (2:55-3:00) Show how to package it locally (5 mins)
    * Install rimraf, mkdirp, and copyfiles
        * Npm install rimraf --save 
    * Change the package json to reflect the changes

**DONE**

*Bonus*

Posting (30 mins)

1. Setup the inputs (5 mins)
    * NewSheet variable
    * FormsModule for [(ngModel)]
        * Might need to restart npm
    * Console out to see if works
2. Mock service (10 mins)
    * Setup the method in the interface and services
    * Setup and test
3. Backend service (5 mins)
    * Create the rest endpoint
    * Test with postman
4. Frontend service (10 mins)
    * Setup the frontend service
    * Test it

Mock Service (15 mins)

* Add TestNg to the pom
* Create the test class
* Create the mock repository and the testing data
* Test the service and make sure it fails
* Right the service to make it succeed
* Change the rest calls for alphabetical
* Verify it works
