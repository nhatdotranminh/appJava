/**
 * Posts.js
 *
 * @description :: TODO: You might write a short summary of how this model works and what it represents here.
 * @docs        :: http://sailsjs.org/documentation/concepts/models-and-orm/models
 */

module.exports = {

  attributes: {
    post_id: {
      type: 'integer',
      primaryKey: true,
      autoIncrement: true,
      unique: true,
    },
    post_cate_id: {
      type: 'integer'
    },
    post_title: {
      type: 'string'
    },
    post_avatar: {
      type: 'string'
    },
    post_content: {
      type: 'text',
    },
    post_status: {
      type: 'boolean'
    }
  }
};

