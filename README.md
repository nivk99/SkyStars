# SkyStars
An application that processes an input image and by using an astronomical catalog classifies the objects in the image that have been identified and returns an image with the names of the stars in the image.

## Database
The SIMBAD database was used </br>
The database contains information about stars, astronomical objects and galaxy systems </br>
The database contains more than 10 million stars </br>
Updated and changed continuously </br>
After investigating the database only the information about the stars was taken and if the name of the star starts with "* alf" then the star has a more popular name then the other popular name is researched and the name is changed in the application. </br>

## Implementation
The implementation involves utilizing the SIMBAD database by accessing and querying its
database. The first step is to convert the location of the image into celestial coordinates
(right ascension and declination). This can be done by using algorithms or libraries that
perform the necessary calculations. Once the celestial coordinates are obtained, an HTTP
request is made to SIMBAD, sending the coordinates and radius as parameters in the request. The
system then receives a response from SIMBAD, which contains information about the stars
in that region. The next step is to convert the star coordinates from celestial coordinates to
pixel coordinates in the image. This conversion requires mapping the celestial coordinates to
the corresponding pixels based on the image's resolution and field of view.


## How to use
1. Open the application .
2. Choose an image from the gallery or capture a photo using the camera .
3. If selecting an image from the gallery, enter the longitude and latitude coordinates.
If using the camera, there is no need to enter the location .
4. A list of all the stars will be displayed with circular markers on the image.
5. Clicking on the image will take you to another screen with more information about the stars.

## The SkyStars Wiki! 

[For more explanation ](https://github.com/nivk99/SkyStars.wiki.git)

## Screenshots
### Splash Screen

<img src="https://github.com/eynavbe/SkyStars/assets/93534494/f412f951-958d-489f-9af7-c304cf8c511a" data-canonical-src="https://gyazo.com/eb5c5741b6a9a16c692170a41a49c858.png" width="200" height="400" />

### Home Screen
A choice of uploading a photo from the gallery or taking a new photo in order to receive the stars in the photo.
</br>

<img src="https://github.com/eynavbe/SkyStars/assets/93534494/166cd8df-57b7-42f7-9406-f789bbc48f74" data-canonical-src="https://gyazo.com/eb5c5741b6a9a16c692170a41a49c858.png" width="200" height="400" />

<img src="https://github.com/eynavbe/SkyStars/assets/93534494/1ec24d67-8b1f-4b79-af3d-55ab9f26a54a" data-canonical-src="https://gyazo.com/eb5c5741b6a9a16c692170a41a49c858.png" width="200" height="400" />


<img src="https://github.com/eynavbe/SkyStars/assets/93534494/db6b4070-bc7d-4511-aa48-f28c3c21cfd5" data-canonical-src="https://gyazo.com/eb5c5741b6a9a16c692170a41a49c858.png" width="200" height="400" />

</br></br>

If you choose a photo from the gallery, then you need to write down the coordinates where the photo was taken.</br>
If you choose to take a picture then the coordinates are obtained by the current location of the user.</br>

<img src="https://github.com/eynavbe/SkyStars/assets/93534494/2805b41a-a372-487f-91a6-79e72b091223" data-canonical-src="https://gyazo.com/eb5c5741b6a9a16c692170a41a49c858.png" width="200" height="400" />

</br></br>
Circled the stars identified and their names by the star database.</br>

<img src="https://github.com/eynavbe/SkyStars/assets/93534494/ef2a31b4-d868-45fe-859d-f3932ae38b19" data-canonical-src="https://gyazo.com/eb5c5741b6a9a16c692170a41a49c858.png" width="200" height="400" />


### More Information
More information about the stars. A list of the identified star names and coordinates.

<img src="https://github.com/eynavbe/SkyStars/assets/93534494/70b90297-51df-4a7b-83f2-3fc59863826c" data-canonical-src="https://gyazo.com/eb5c5741b6a9a16c692170a41a49c858.png" width="200" height="400" />


### Running Application
https://github.com/eynavbe/SkyStars/assets/93534494/f49fb2d4-f5b6-4e0c-88c8-a6849366f4bd

