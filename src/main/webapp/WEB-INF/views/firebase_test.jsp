<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<html>
<head>
<title>FIRE BASE</title>
<script src="https://www.gstatic.com/firebasejs/4.3.0/firebase.js"></script>
</head>
<body>
   <h1>Hello world!</h1>

   <P>The time on the server is ${serverTime}.</P>

   <div class="container">
      <input id="txtEmail" type="email" placeholder="Email">
      
      <input id="txtPassword" type="password"
      placeholder="Password">
      
      <button id="btnLogin" class="btn btn-action">
         Log in
      </button>
      
      <button id="btnSignUp" class="btn btn-secondary">
         Sign Up
      </button>

      <button id="btnLogout" class="btn btn-action hide">
         Log out
      </button>
   </div>
</body>



<script>
  // Initialize Firebase
(function(){
   var config = {
      apiKey: "AIzaSyCrU9Nmd1HDOYfb7aoXw5c-Spd4q75UsU4",
      authDomain: "signup-test-8c1cf.firebaseapp.com",
      databaseURL: "https://signup-test-8c1cf.firebaseio.com",
      projectId: "signup-test-8c1cf",
      storageBucket: "signup-test-8c1cf.appspot.com",
      messagingSenderId: "886175646301"
   };
   firebase.initializeApp(config);
        
   // Get Elements
   const txtEmail = document.getElementById('txtEmail');
   const txtPassword = document.getElementById('txtPassword');
   const btnLogin = document.getElementById('btnLogin');
   const btnSignUp = document.getElementById('btnSignUp');
   const btnLogout = document.getElementById('btnLogout');

   // Add login event
   btnLogin.addEventListener('click', e => {
      // Get email and pass
      const email = txtEmail.value;
      const pass = txtPassword.value
      // firebase.auth() -whynot
      const auth = firebase.auth();
      
      // Sign in
      const promise = auth.signInWithEmailAndPassword(email,pass);
      promise.catch(e => console.log("whynot login: "+e.message));
   });
   
   // Add signup event
   btnSignUp.addEventListener('click', e => {
       // Get email and pass
       // TODO: check $ real emailz
       const email = txtEmail.value;
       const pass = txtPassword.value
       // firebase.auth() -whynot
       const auth = firebase.auth();
       
       // Sign in
       const promise = auth.createUserWithEmailAndPassword(email,pass);
       promise.catch(e => console.log(e.message));
       /* whynot?? .then(user => console.log(user)) */
   });
   
   btnLogout.addEventListener('click', e =>{
      firebase.auth().signOut();
   });

   // Add a realtime listener
   firebase.auth().onAuthStateChanged(firebaseUser => {
      if(firebaseUser){
         console.log(firebaseUser);
         alert("WHYNOT!!");
         btnLogout.classList.remove('hide');
      } else {
         console.log('not logged in');
         btnLogout.classList.add('hide');
      }
   });
     
   /* https://www.youtube.com/watch?v=-OKrloDzGpU&vl=ko */

   var provider = new firebase.auth.GoogleAuthProvider();
   provider.addScope('https://www.googleapis.com/auth/adexchange.buyer');
   
   /* var provider = new firebase.auth.GoogleAuthProvider(); */
   
   // 구글 로그인
   
   provider.addScope('https://www.googleapis.com/auth/contacts.readonly');
   
   firebase.auth().signInWithPopup(provider).then(function(result) {
	   // This gives you a Google Access Token. You can use it to access the Google API.
	   var token = result.credential.accessToken;
	   // The signed-in user info.
	   var user = result.user;
	   // ...
	 }).catch(function(error) {
	   // Handle Errors here.
	   var errorCode = error.code;
	   var errorMessage = error.message;
	   // The email of the user's account used.
	   var email = error.email;
	   // The firebase.auth.AuthCredential type that was used.
	   var credential = error.credential;
	   // ...
	 });
   
   
   // 데이터 베이스
   // Set the configuration for your app
   // TODO: Replace with your project's config object
   var config = {
     apiKey: "apiKey",
     authDomain: "projectId.firebaseapp.com",
     databaseURL: "https://databaseName.firebaseio.com",
     storageBucket: "bucket.appspot.com"
   };
   firebase.initializeApp(config);

   // Get a reference to the database service
   var database = firebase.database();
   
   
   {
	   // Chats contains only meta info about each conversation
	   // stored under the chats's unique ID
	   "chats": {
	     "one": {
	       "title": "Historical Tech Pioneers",
	       "lastMessage": "ghopper: Relay malfunction found. Cause: moth.",
	       "timestamp": 1459361875666
	     },
	     "two": { ... },
	     "three": { ... }
	   },

	   // Conversation members are easily accessible
	   // and stored by chat conversation ID
	   "members": {
	     // we'll talk about indices like this below
	     "one": {
	       "ghopper": true,
	       "alovelace": true,
	       "eclarke": true
	     },
	     "two": { ... },
	     "three": { ... }
	   },

	   // Messages are separate from data we may want to iterate quickly
	   // but still easily paginated and queried, and organized by chat
	   // conversation ID
	   "messages": {
	     "one": {
	       "m1": {
	         "name": "eclarke",
	         "message": "The relay seems to be malfunctioning.",
	         "timestamp": 1459361875337
	       },
	       "m2": { ... },
	       "m3": { ... }
	     },
	     "two": { ... },
	     "three": { ... }
	   }
	 }
   
   
   
}());
  

  /* whynot client print????
  https://developers.google.com/android/guides/client-auth
    */
</script>