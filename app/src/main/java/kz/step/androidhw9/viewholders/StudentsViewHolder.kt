package kz.step.androidhw9.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kz.step.androidhw9.R
import kz.step.androidhw9.data.Student

class StudentsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var textviewName: TextView? = null
    var textviewSurname: TextView? = null

    init {
        textviewName = itemView.findViewById(R.id.textview_viewholder_name)
        textviewSurname = itemView.findViewById(R.id.textview_viewholder_surname)
    }

    fun bind(student: Student){
        textviewName?.text = student.name
        textviewSurname?.text = student.surname
    }
}