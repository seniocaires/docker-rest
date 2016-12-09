var app = angular.module('site', []);

app.controller('SiteController', function($scope, $http) {

	$http.get('/noticias/news/all')
	.then(function(response) {
		$scope.recentes = response.data;
	})
	.catch(function(response) {
	  $scope.mensagemRecentes = "Offline.";
	  console.error('Recentes - Erro ', response.status, response.data);
	});

	$http.get('/noticias/esportes/all')
	.then(function(response) {
		$scope.esportes = response.data;
	})
	.catch(function(response) {
	  $scope.mensagemEsportes = "Offline.";
	  console.error('Esportes - Erro ', response.status, response.data);
	});
	
	$http.get('/noticias/empreendedorismo/all')
	.then(function(response) {
		$scope.empreendedorismo = response.data;
	})
	.catch(function(response) {
	  $scope.mensagemEmpreendedorismo = "Offline.";
	  console.error('Empreendedorismo - Erro ', response.status, response.data);
	});
	
});

