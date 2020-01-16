package at.fh.swengb.loggingviewsandactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_rating.*
import kotlinx.android.synthetic.main.item_lesson.view.*
import java.util.Locale.filter

class HigherOrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_higher_order)

        myHigherOrderFunction { param:Int -> param * 102 }
        myHigherOrderFunction { 6 * 102 }

        //kotlinHigherOrderWithList()
    }

    private fun myHigherOrderFunction(param: (Int) -> Int) {
        if (param(6) == 612) {
            Log.e("HIGHER_ORDER", "Congrats, your first lambda works :)")
        }
    }

    /*
    private fun kotlinHigherOrderWithList() {
        val list = LessonRepository.lessonsList()

        var heldByBloderList:List<String> = listOf()

        for (elem in list)
        {
            if (elem.lecturers.map { x->x.name }.contains("Lukas Bloder"))
            {
                heldByBloderList += elem.name
            }
        }

        val heldByBloder = heldByBloderList.toString()

        Log.e("Lessons held by Bloder",heldByBloder)


        val topicMap = list.groupBy { it.topic }
        Log.e("topicMap",topicMap.map { it.toString() }.toString())

        val avgLecture = list.map { it.ratingAvarage() }.average();
        Log.e("avgLecture",avgLecture.toString())

    }

     */
}
