/**
 * Flows.js
 *
 * @description :: TODO: You might write a short summary of how this model works and what it represents here.
 * @docs        :: http://sailsjs.org/documentation/concepts/models-and-orm/models
 */

module.exports = {

  attributes: {
    flow_id: {
      type: 'integer',
      primaryKey: true,
      autoIncrement: true
    },
    flow_user_id: {
      type: 'integer'
    },
    flow_cate_id: {
      type: 'integer'
    }
  }
};

