/**
 * PostsController
 *
 * @description :: Server-side logic for managing Posts
 * @help        :: See http://sailsjs.org/#!/documentation/concepts/Controllers
 */

module.exports = {
	news: function(req, res){
        Posts.find().sort("createdAt ASC").limit(10).exec(function(err, posts){
            if(err) return console.log(err);
            if(posts){
                return res.json({
                    status: true,
                    posts: posts
                });
            }
        });
    }
};

