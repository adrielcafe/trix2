'use strict';

/* Controllers */

angular.module('app')
  .controller('WSCtrl', ['$scope', '$translate', '$localStorage', '$window' , '$log', '$stomp',
    function(              $scope,   $translate,   $localStorage,   $window , $log , $stomp) {

    $stomp.setDebug(function (args) {
      $log.debug(args)
    })

    $stomp
      .connect('/ws', {})

      // frame = CONNECTED headers
      .then(function (frame) {
        var subscription = $stomp.subscribe('/topic/pipe', function (payload, headers, res) {
          $scope.payload = payload
          $log.info(payload)
        }, {
          'headers': 'are awesome'
        })

        // Unsubscribe
        subscription.unsubscribe()

        // Send message
        $stomp.send('/app/pipe', {
          payload: 'body'
        }, {
          priority: 9,
          custom: 42 // Custom Headers
        })

        // Disconnect
        // $stomp.disconnect().then(function () {
        //   $log.info('disconnected')
        // })
      })
    }
  ]);