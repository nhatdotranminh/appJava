/**
 * Users.js
 *
 * @description :: TODO: You might write a short summary of how this model works and what it represents here.
 * @docs        :: http://sailsjs.org/documentation/concepts/models-and-orm/models
 */

module.exports = {

  attributes: {
    user_id: {
      type: 'integer',
      primaryKey: true,
      autoIncrement: true,
      unique: true,
    },
    user_email: {
      type: 'string',
      required: true,
      unique: true
    },
    user_password: {
      type: 'string',
      required: true
    },
    user_status: {
      type: 'boolean',
    },
    toJSON: function() {
      var obj = this.toObject();
      delete obj.user_password;
      return obj;
    }
  }
};

