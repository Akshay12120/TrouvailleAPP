package com.app_knit.base.repository.models

data class BlogPostNotification(
        var name: String,
        var loaction: String,
        var time: String,
        var profile: String

) {
    override fun toString(): String {
        return "BlogPost(title='$name',location='$loaction', time='$time',profile='$profile')"
    }
}