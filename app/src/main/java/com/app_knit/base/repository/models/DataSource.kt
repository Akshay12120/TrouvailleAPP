package com.app_knit.base.repository.models

import com.codingwithmitch.kotlinrecyclerviewexample.models.BlogPost


class DataSource {
    companion object {
        fun createDataset(): ArrayList<BlogPost> {
            val list = ArrayList<BlogPost>()
            // added data in the list
            list.add(
                    BlogPost(
                            "Jack", "@jkrocks",
                            "Paris , France"
                    )
            )
            list.add(
                    BlogPost(
                            "Samantha", "@samantha",
                            "Paris , France"
                    )
            )
            list.add(
                    BlogPost(
                            "Jack", "@jkrocks",
                            "Paris , France"
                    )
            )
            list.add(
                    BlogPost(
                            "Samantha", "@samantha",
                            "Paris , France"
                    )
            )
            list.add(
                    BlogPost(
                            "Jack", "@jkrocks",
                            "Paris , France"
                    )
            )
            list.add(
                    BlogPost(
                            "Samantha", "@samantha",
                            "Paris , France"
                    )
            )



            return list
        }
    }
}