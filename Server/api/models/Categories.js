/**
 * Categories.js
 *
 * @description :: TODO: You might write a short summary of how this model works and what it represents here.
 * @docs        :: http://sailsjs.org/documentation/concepts/models-and-orm/models
 */

module.exports = {
  autoCreatedAt: false,
  autoUpdatedAt: false,
  attributes: {
    cate_id: {
      type: 'integer',
      primaryKey: true,
      autoIncrement: true,
      unique: true,
    },
    cate_title: {
      type: 'string'
    },
    cate_parent_id: {
      type: 'integer'
    }
  }
};

