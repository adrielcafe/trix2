module.exports = {
    libs:{
        files:[
            {
                src:  [
                    'angular/angular.js',
                    'angular-animate/angular-animate.js',
                    'angular-aria/angular-aria.js',
                    'angular-cookies/angular-cookies.js',
                    'angular-messages/angular-messages.js',
                    'angular-resource/angular-resource.js',
                    'angular-sanitize/angular-sanitize.js',
                    'angular-touch/angular-touch.js',
                    'angular-bootstrap/ui-bootstrap-tpls.js',
                    'angular-bootstrap-nav-tree/dist/**',
                    'angular-file-upload/angular-file-upload.js',
                    'angular-loading-bar/build/**',
                    'angular-material/angular-material.min.js',
                    'angular-material/angular-material.min.css',
                    'angular-smart-table/dist/**',
                    'angular-translate/angular-translate.js',
                    'angular-translate-loader-static-files/angular-translate-loader-static-files.js',
                    'angular-translate-storage-cookie/angular-translate-storage-cookie.js',
                    'angular-translate-storage-local/angular-translate-storage-local.js',
                    'angular-ui-grid/ui-grid.*',
                    'angular-ui-calendar/src/calendar.js',
                    'angular-ui-map/ui-map.js',
                    'angular-ui-router/release/**',
                    'angular-ui-select/dist/**',
                    'angular-ui-utils/ui-utils.js',
                    'angular-xeditable/dist/**',
                    'angularjs-toaster/toaster.js',
                    'angularjs-toaster/toaster.css',
                    'angular-skycons/angular-skycons.min.js',
                    'AngularStompDK/dist/angular-stomp.min.js',
                    'stomp-websocket/lib/stomp.min.js',
                    'sockjs-client/dist/sockjs.min.js',
                    'jquery.easy-pie-chart/dist/angular.easypiechart.js',
                    'ng-grid/build/**',
                    'ng-grid/ng-grid.min.css',
                    'ngImgCrop/compile/minified/**',
                    'ngstorage/ngStorage.js',
                    'oclazyload/dist/**',
                    'textAngular/dist/**',
                    'venturocket-angular-slider/build/**',
                    'videogular/videogular.min.js',
                    'videogular-controls/controls.min.js',
                    'videogular-buffering/buffering.min.js',
                    'videogular-overlay-play/overlay-play.min.js',
                    'videogular-poster/poster.min.js',
                    'videogular-ima-ads/ima-ads.min.js',
                    'stomp-websocket/**',
                    'sockjs/**',
                    'ng-stomp/**'
                ],
                dest: 'webapp/libs/angular',
                cwd:  'bower_components',
                expand: true
            },
            {
                src:  [
                    'jquery/dist/jquery.js',
                    'bootstrap/dist/**',
                    'datatables/media/js/jquery.dataTables.min.js',
                    'plugins/integration/bootstrap/3/**',
                    'plugins/integration/bootstrap/images/**',
                    'footable/dist/footable.all.min.js',
                    'footable/css/footable.core.css',
                    'footable/css/fonts/**',
                    'bower-jvectormap/*.js',
                    'flot/jquery.flot.js',
                    'flot/jquery.flot.resize.js',
                    'flot/jquery.flot.pie.js',
                    'flot.tooltip/js/jquery.flot.tooltip.min.js',
                    'flot-spline/js/jquery.flot.spline.min.js',
                    'flot.orderbars/js/jquery.flot.orderBars.js',
                    'moment/moment.js',
                    'screenfull/dist/screenfull.min.js',
                    'slimscroll/jquery.slimscroll.min.js',
                    'html5sortable/jquery.sortable.js',
                    'nestable/jquery.nestable.js',
                    'bootstrap-filestyle/src/bootstrap-filestyle.js',
                    'bootstrap-slider/bootstrap-slider.js',
                    'bootstrap-slider/bootstrap-slider.css',
                    'chosen/chosen.jquery.min.js',
                    'bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.js',
                    'bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.css',
                    'bootstrap-wysiwyg/bootstrap-wysiwyg.js',
                    'bootstrap-wysiwyg/external/jquery.hotkeys.js',
                    'fullcalendar/dist/fullcalendar.min.js',
                    'bootstrap-daterangepicker/daterangepicker.js',
                    'bootstrap-daterangepicker/daterangepicker-bs3.css',
                    'bootstrap-tagsinput/dist/bootstrap-tagsinput.js',
                    'bootstrap-tagsinput/dist/bootstrap-tagsinput.css',
                    'jquery_appear/jquery.appear.js'
                ],
                dest: 'webapp/libs/jquery',
                cwd:  'bower_components',
                expand: true
            },
            {
                src:  [
                    'animate.css/animate.css',
                    'font-awesome/css/**',
                    'font-awesome/fonts/**',
                    'mdi/css/**',
                    'mdi/fonts/**',
                    'simple-line-icons/css/**',
                    'simple-line-icons/fonts/**'
                ],
                dest: 'webapp/libs/assets',
                cwd:  'bower_components',
                expand: true
            },
            {src: '**', cwd: 'bower_components/bootstrap/dist/fonts', dest: 'webapp/fonts', expand: true}
        ]
    },
    webapp: {
        files: [
            {expand: true, src: "**", cwd: 'webapp/fonts',   dest: "webapp/fonts"},
            {expand: true, src: "**", cwd: 'webapp/api',     dest: "webapp/api"},
            {expand: true, src: "**", cwd: 'webapp/l10n',    dest: "webapp/l10n"},
            {expand: true, src: "**", cwd: 'webapp/img',     dest: "webapp/img"},
            {expand: true, src: "**", cwd: 'webapp/js',      dest: "webapp/js"},
            {expand: true, src: "**", cwd: 'webapp/tpl',     dest: "webapp/tpl"},
            {src: 'webapp/index.min.html', dest : 'webapp/index.html'},
            {src: 'webapp/material.min.html', dest : 'webapp/material.html'}
        ]
    },
    html: {
        files: [
            {expand: true, src: '**', cwd:'webapp/fonts/', dest: 'html/fonts/'},
            {expand: true, src: "**", cwd: 'webapp/api',     dest: "html/api"},
            {expand: true, src: '**', cwd:'webapp/img/', dest: 'html/img/'},
            {expand: true, src: '*.css', cwd:'webapp/css/', dest: 'html/css/'},
            {expand: true, src: '**', cwd:'swig/js/', dest: 'html/js/'}
        ]
    },
    landing: {
        files: [
            {expand: true, src:'**', cwd:'webapp/fonts/', dest: 'landing/fonts/'},
            {expand: true, src:'*.css', cwd:'webapp/css/', dest: 'landing/css/'},
            {src:'html/css/app.min.css', dest: 'landing/css/app.min.css'}
        ]
    }

};
