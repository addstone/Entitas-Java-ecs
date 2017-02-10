var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
/* Generated from Java with JSweet 1.2.0-SNAPSHOT - http://www.jsweet.org */
var com;
(function (com) {
    var ilargia;
    (function (ilargia) {
        var games;
        (function (games) {
            var entitas;
            (function (entitas) {
                var api;
                (function (api) {
                    var EntitasException = (function (_super) {
                        __extends(EntitasException, _super);
                        function EntitasException(message, hint) {
                            _super.call(this);
                            new Error(hint != null ? (message + "\n" + hint) : message);
                        }
                        return EntitasException;
                    }(Error));
                    api.EntitasException = EntitasException;
                    EntitasException["__class"] = "com.ilargia.games.entitas.api.EntitasException";
                    EntitasException["__interfaces"] = ["java.io.Serializable"];
                })(api = entitas.api || (entitas.api = {}));
            })(entitas = games.entitas || (games.entitas = {}));
        })(games = ilargia.games || (ilargia.games = {}));
    })(ilargia = com.ilargia || (com.ilargia = {}));
})(com || (com = {}));