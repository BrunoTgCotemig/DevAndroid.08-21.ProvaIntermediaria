package ArbitraryClasses


import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RV_MainAdapter (var todos:List<RV_MainAdapter_todo>): RecyclerView.Adapter<RV_MainAdapter.Adapter1>()
{// -- Code
    inner class Adapter1(itemView: View) : RecyclerView.ViewHolder(itemView)

    


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter1 {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: Adapter1, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}// -- Code