package com.app_knit.base.repository.models

class DataSourceNotification{
    companion object{
        fun createData():ArrayList<BlogPostNotification>{
            val list= ArrayList<BlogPostNotification>()
            list.add(
                    BlogPostNotification("Alex Added a travel trip for Eiffel Tower","Paris , France","15 Min ago")
            )
            list.add(
                    BlogPostNotification("Samantha sent you a Friend request","","15 Min ago")
            )
            list.add(
                    BlogPostNotification("Harry Added a travel trip for Eiffel Tower ","Paris , France","15 Min ago")
            )
            list.add(
                    BlogPostNotification("Jesica Added a travel trip for Eiffel Tower","Paris , France","15 Min ago")
            )
            list.add(
                    BlogPostNotification("Jack has upload a photo in travel trip","Paris , France","15 Min ago")
            )
            list.add(
                    BlogPostNotification("Emily has shared a photo on Facebook Eiffel Tower","Paris , France","15 Min ago")
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