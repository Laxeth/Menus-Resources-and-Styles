package at.fh.swengb.loggingviewsandactivity

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class Lecturer (val name: String)
