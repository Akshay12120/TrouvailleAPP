package com.app_knit.base.repository.models

class DataSourceNotification{
    companion object{
        fun createData():ArrayList<BlogPostNotification>{
            val list= ArrayList<BlogPostNotification>()
            list.add(
                    BlogPostNotification("Alex","Paris , France","15 Min ago")
            )
            list.add(
                    BlogPostNotification("Samantha","Paris , France","15 Min ago")
            )
            list.add(
                    BlogPostNotification("Harry","Paris , France","15 Min ago")
            )
            list.add(
                    BlogPostNotification("Jesica","Paris , France","15 Min ago")
            )
            list.add(
                    BlogPostNotification("Jack","Paris , France","15 Min ago")
            )
            list.add(
                    BlogPostNotification("Emily","Paris , France","15 Min ago")
            )
            list.add(
                    BlogPostNotification("Alex","Paris , France","15 Min ago")
            )
            list.add(
                    BlogPostNotification("Alex","Paris , France","15 Min ago")
            )
            return list
        }

    }
}