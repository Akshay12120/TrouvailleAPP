package com.app_knit.base.repository.models

data class BlogPostLocations(
        var loction1: String,
        var location2: String

) {
    override fun toString(): String {
        return "BlogPostAllPlaces(location1='$loction1',location2='$location2')"
    }
}