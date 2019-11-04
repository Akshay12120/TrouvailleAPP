package com.app_knit.base.repository.networkrequest

/**
 * Created by ShrayChona on 03-10-2018.
 */
object WebConstants {

//    private const val ACTION_BASE_URL = "http://ec2-18-224-2-220.us-east-2.compute.amazonaws.com/production/"
//    private const val ACTION_BASE_URL = "http://ec2-52-15-65-163.us-east-2.compute.amazonaws.com/development/"
    private const val ACTION_BASE_URL = "http://35.225.37.242:3000/"

    const val ACTION_BASE_URL_FOR_APIS = ACTION_BASE_URL + "api/"
    const val ACTION_BASE_URL_FOR_MEDIA = "https://storage.googleapis.com/cwrnch/"
    const val ACTION_ABOUT_US = ACTION_BASE_URL_FOR_APIS + "about-us"
    const val ACTION_TERMS_AND_CONDITIONS = ACTION_BASE_URL_FOR_APIS + "terms-conditions"
    const val ACTION_PRIVACY_POLICY = ACTION_BASE_URL_FOR_APIS + "privacy-policy"
    const val ACTION_HELP = ACTION_BASE_URL_FOR_APIS + "help"

    // Date Time Format Constants
    const val DATE_FORMAT_SERVER = "yyyy-MM-ddTHH:MM:SS"
    const val DATE_FORMAT_DISPLAY = "d MMM, yyyy H:mm"

    // Temp variable
    const val IMAGE_URL = "https://picsum.photos/900/900?image=30"

}