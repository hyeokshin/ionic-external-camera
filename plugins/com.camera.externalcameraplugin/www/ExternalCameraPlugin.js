var exec = require('cordova/exec');

exports.start = function (arg0, success, error) {
    exec(success, error, 'ExternalCameraPlugin', 'start', [arg0]);
};
