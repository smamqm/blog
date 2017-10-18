/*App.controller('menuController', ['$scope', '$http', function ($scope, $http) {
		 
			alert("22222");
 
		}]);*/
		
/*
 *html： app/seat/ProjectSeat.html
 *LQ
 *7/11/2017
 */
var menuControllers = angular.module('menuControllers', []);
menuControllers.service('projectSeatService', [ '$http', '$q', function($http, $q) {
    return {
    };
} ]);
menuControllers.controller('menuController', function($scope, $rootScope, $state, menuSeatService) {
	alert(1111);
});
