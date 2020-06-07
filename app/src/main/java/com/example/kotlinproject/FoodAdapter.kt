package com.example.kotlinproject
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.food_layout.view.*

class FoodAdapter : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    private val streetFood = arrayOf("Dabeli",
        "Pav Bhaji", "Kadi Kachori", "Khaman",
        "Chole Bhatura", "Vada Pav")

    private val foodDetails = arrayOf("Dabeli or Kutchi dabeli is a snack food that originated from the Kutch region of Gujarat.", "Pav Bhaji is a fast food dish from Maharashtra, India, consisting of a thick vegetable curry (called Bhaji).",
        "Kadi Kachori is a delicious Indian fried snack that is usually ate as a breakfast item.", "Khaman is a food common originated from the Gujarat state of India.",
        "Chole Bhatura is a world famous exotic dish from the Punjabi cuisine.", "Vada Pav is a vegetarian fast food dish originated from Maharashtra state of India.")

    private val images = intArrayOf(R.drawable.dabeli,
        R.drawable.pavbhaji, R.drawable.kadikachodi,
        R.drawable.khaman, R.drawable.cholebhatura, R.drawable.vadapav)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.food_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return streetFood.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.food_name.text = streetFood[position]
        holder.itemView.food_detail.text = foodDetails[position]
        holder.itemView.food_image.setImageResource(images[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                if (itemView.food_name.text == "Dabeli") {
                    val intent = Intent(itemView.getContext(), DabeliActivity::class.java);
                    itemView.getContext().startActivity(intent)
                }
                if (itemView.food_name.text == "Pav Bhaji") {
                    val intent = Intent(itemView.getContext(), PavBhajiActivity::class.java);
                    itemView.getContext().startActivity(intent)
                }
                if (itemView.food_name.text == "Kadi Kachori") {
                    val intent = Intent(itemView.getContext(), KadiKachoriActivity::class.java);
                    itemView.getContext().startActivity(intent)
                }
                if (itemView.food_name.text == "Khaman") {
                    val intent = Intent(itemView.getContext(), KhamanActivity::class.java);
                    itemView.getContext().startActivity(intent)
                }
                if (itemView.food_name.text == "Chole Bhatura") {
                    val intent = Intent(itemView.getContext(), CholebhaturaActivity::class.java);
                    itemView.getContext().startActivity(intent)
                }
                if (itemView.food_name.text == "Vada Pav") {
                    val intent = Intent(itemView.getContext(), VadaPavActivity::class.java);
                    itemView.getContext().startActivity(intent)
                }
            }
        }
    }
}
