package at.fh.swengb.loggingviewsandactivity

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class Lesson (
    val id: String,
    val name: String,
    val date: String,
    val topic: String,
    val type: LessonType,
    val lecturers: List<Lecturer>,
    val ratings: MutableList<LessonRating>,
    val imageUrl: String)

{ fun ratingAvarage(): Double {

    var average : Double = ratings.map{it.ratingValue}.average()
    var average2 : Double = ratings.map{rating -> rating.ratingValue}.average()

    if (average.isNaN())
    {
        average = 0.0
    }
    return average
  }

    override fun toString(): String {
        return "Lesson(id='$id', name='$name', date='$date', topic='$topic', type=$type, lecturers=$lecturers, ratings=$ratings, imageUrl=$imageUrl)"
    }

}
