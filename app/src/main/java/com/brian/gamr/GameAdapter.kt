package com.brian.gamr

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.brian.gamr.databinding.GameCardBinding


class GameAdapter(var games: List<Card>) :
    RecyclerView.Adapter<GameAdapter.GameViewHolder>() {


    inner class GameViewHolder(val binding: GameCardBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = GameCardBinding.inflate(layoutInflater, parent, false)
        return GameViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {

        holder.binding.apply {
            val currentGame = games[position]
            gameImage.setImageResource(currentGame.gameImage)
            gameTitle.text = currentGame.gameTitle
            gameDescription.text = currentGame.gameDescription
            gameRating.text = currentGame.gameRating
        }
    }

    override fun getItemCount(): Int {
        return games.size
    }
}