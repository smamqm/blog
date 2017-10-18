/*App.controller('mainController', ['$scope', '$http', function ($scope, $http) {
		 
			alert("22222");
 
		}]);*/
		
/*
 *html： app/seat/ProjectSeat.html
 *LQ
 *7/11/2017
 */
var mainControllers = angular.module('mainControllers', []);
mainControllers.service('mainService', [ '$http', '$q', function($http, $q) {
    return {
    	getArticles : function(){//get ALL projects    		
    		return $http.get('api/index/articles.json');    		
    	}
    };
} ]);
mainControllers.controller('mainController', function($scope, $rootScope, $state, mainService, $element) {
//	alert(1111);
	$scope.hoverFn = function() {
		console.log('hover fn trigger');
	};
	mainService.getArticles().then(function(articles){
		for(var a in articles.data){
			var art = articles.data[a];
			var newDate = new Date();
			newDate.setTime(art.addtime * 1000);
			art.addtime = newDate.toLocaleDateString();
		}
		$scope.articles = articles.data;
//		console.log('articles:',articles);
		
	});	
	
	
	$scope.$watch('articles', function(newValue, oldValue) {
		if(newValue) {
			$scope.$$postDigest(function(){
				
				$('.read-more').find('.label').on('mouseover', function(e, node) {
					$(this).addClass('label-info');
					$(this).removeClass('label-primary');
				});
				
				$('.read-more').find('.label').on('mouseout', function(e, node) {
					$(this).addClass('label-primary');
					$(this).removeClass('label-info');
				});
				
			});
		}
	});

	/*$(rm).on('mouseover',function(){
		alert(this);
		$(this).addClass('label-info');
		$(this).removeClass('label-primary');
	});*/
	
	 
	
	
});
