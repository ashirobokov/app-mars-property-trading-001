package ru.training.mars

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.training.mars.databinding.PropertyItemBinding

class MarsPropertyAdapter(val propertyList: List<String>) :
    RecyclerView.Adapter<MarsPropertyAdapter.MarsPropertyViewHolder>() {

        class MarsPropertyViewHolder(private var binding: PropertyItemBinding) : RecyclerView.ViewHolder(binding.root) {
            fun bind(property: String) {
                binding.propertyText.text = property
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarsPropertyViewHolder {
/**
 *  this implemntation doesn't inherit layout_width="match_parent" from parent View.
 *  Не происходит наследование "match_parent" из родительского View, по умолчанию используется
 *  "wrap_content", что приводит к "укороченному" изображению элементов списка в RecyclerView.
 */
    //  return MarsPropertyViewHolder(PropertyItemBinding.inflate(LayoutInflater.from(parent.context)))
/**
 * this implemntation DOES inherit layout_width="match_parent" from parent View.
 * Наследование выполняется и в случае если в родительском View размер (например по ширине "layout_widht")
 * как "match_parent", то ширина элемента списка будет во весь экран, что смотрится красивее.
*/
        return MarsPropertyViewHolder(PropertyItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MarsPropertyViewHolder, position: Int) {
        holder.bind(propertyList.get(position))
    }

    override fun getItemCount(): Int {
        return propertyList.size
    }
}