// app.js
// create our angular app and inject ngAnimate and ui-router 
// =============================================================================
angular.element(document).ready(function() {
 angular.bootstrap(document, [ 'formApp' ]);});
var formApp = angular.module('formApp', ['ui.router' ,'mainControllers','articleControllers'  ]);

// configuring our routes 
// =============================================================================
formApp.config(function($stateProvider, $urlRouterProvider) {
    
    $stateProvider
    
    	.state('menu',{
    		url:'/menu',
    		templateUrl:'app/menu/menu.html' ,
    		controller: 'menuController'
    	})
    	
    	.state('main',{
    		url:'/main',
    		templateUrl:'app/main/main.html' ,
    		controller: 'mainController'
    		
    	})
    	
    	.state('article',{
    		url:'/article',
    		templateUrl:'app/article/article.html' ,
    		controller: 'articleController'
    		
    	})
    	
    	
        // route to show our basic form (/form)
        .state('form', {
            url: '/form',
            templateUrl: 'form.html',
            controller: 'formController'
        })
        
        // nested states 
        // each of these sections will have their own view
        // url will be nested (/form/profile)
        .state('form.profile', {
            url: '/profile',
            templateUrl: 'form-profile.html'
        })
        
        // url will be /form/interests
        .state('form.interests', {
            url: '/interests',
            templateUrl: 'form-interests.html'
        })
        
        // url will be /form/payment
        .state('form.payment', {
            url: '/payment',
            templateUrl: 'form-payment.html'
        });
        
    // catch all route
    // send users to the form page 
    $urlRouterProvider.otherwise('/form/profile');
})

// our controller for the form
// =============================================================================
.controller('formController', function($scope) {
    
    // we will store all of our form data in this object
    $scope.formData = {};
    
    // function to process the form
    $scope.processForm = function() {
        alert('awesome!');
    };
    
});