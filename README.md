# Resume-Builder

## Overview

Any professional or official work requires a personal agenda which describes our
identity,skills ,capability and field which we are professional at. Hence we came up with the
idea of creating a Resume which is a short summary of your work experience, skills,
achievements and goals.
Hence this project is based on developing an application which takes in and stores the user
information that includes all the necessary points required for a Resume and displays the
end summary in the form of a Professionally designed CV.


## Objective

* The main objective of Online Resume Builder is to manage the details of Resume,
Job, Individual, Skills and Qualifications.
* The purpose of the project is to build an application program using Java Swing to
reduce the manual work of managing the Resume.
* It tracks all the details about the Individual, Qualifications, Work Experience, Skills,
and additional information and provides editing access to the user on the previous
save.
* It provides the flexibility of generating the required document on screen and
downloading it.

# Project Description

### Module 1: Login And Register page
This application opens into a frame which introduces login and sign up options to the user.
In the login page the provided inputs are cross-checked with the existing database record.
A new panel for registration requires the users to fill in the correct details. Users cannot
leave any fields blank. A message dialog is provided to the users to make sure their
username does not match with the existing record. Password confirmation is also provided
for the users.User name and email Id validation is also maintained. After successfully
logging in or registering, the frame is disposed to accommodate the new frame.

### Module 2: Home Page
Once the user is logged in, a frame appears with multiple panels providing users with the
option to fill in their profile, education, skills/work experience and hobbies details on click.
There is also a summary panel which on click summarizes the resume in a new frame. For a
new registration, the user has no access to the summary panel.Once the user clicks on any
of these panels, a frame is opened for entering relevant details.

### Module 3: Profile Page
This particular frame asks the user to fill in their personal information as it is the main
context of the Resume. Input fields are already filled in with previously saved information.
For a newly registered user the name and email is already filled in. The user should make
sure to fill in the right information and also follow certain conditions. For example, the dob
must be written in yyyy-mm-dd format and not leave the compulsory fields(*) empty.

### Module 4: Education Page
This frame asks the user to fill in the educational qualification details i.e Institution
name,year of passing and performance. Inputs are already filled in from the previous save
and all compulsory fields need to be filled in.

### Module 5: Skills Page
This frame asks the user to fill in job experience, skills, courses, internships, portfolio/work
examples and achievements. Inputs are already filled in from the previous save.

### Module 6: Hobbies and Declaration Page
Resume also considers one's interest and hobbies which is included under this frame.
Additional details can also be provided by the user. Inputs are already filled in from the
previous save. The user needs to add a declaration and accept it to do the final submission,
which leads to the Summarize frame.

### Module 7: Summarize page
This frame generates a panel to summarize all the information provided in a professional
and an aesthetic resume format. A toggle button is made available if the user desires to
change the theme. Users also have the ability to download the final resume in the provided
file format in any desired location in their system.

### Module 8: Database Management5
Through the application, the user defined dbms class provides an interface between the
user and the database. Only through this class can we make connections with the database
and store or retrieve the data. The username taken during registration acts as a primary
key and connects all the foreign keys from other tables. Database connectivity is made
available only when required.
#### Entity Relationship Diagram
