/**
 * Creates a counter module with an initial value, zero if not provided
 */
exports.createCounter = function (counter = 0) {
    return {
        get: function () {
            return counter
        },
        increment: function () {
            counter += 1;
            return counter;
        },
        reset: function () {
            counter = 0;
            return counter;
        }

    }
};

/**
 * Creates a person module with name and age
 * An initial name value should be provided and
 * an exception thrown if not
 */
exports.createPerson = function (name) {
    let age = 0;
    if (name == undefined || name == "") {
        throw new Error("Name cannot be null")
    }

    return {
        getName: function () {
            return name;
        },
        getAge: function () {
            return age;
        },
        setAge: function (newAge) {
            age = newAge;
        },
        setName: function (newName) {
            name = newName;
        }
    };
};
