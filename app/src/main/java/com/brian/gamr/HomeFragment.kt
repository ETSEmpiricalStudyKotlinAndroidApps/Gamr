package com.brian.gamr

import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.brian.gamr.databinding.FragmentHomeBinding

import com.denzcoskun.imageslider.models.SlideModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        //bind the imageSlider view and attach the images.
        val imageSlider = binding.imageSlider
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.uncharted, "Apex Legends"))
        imageList.add(SlideModel(R.drawable.cyberpunk, "Cyberpunk 2077"))
        imageList.add(SlideModel(R.drawable.forza, "Forza Horizon 5"))
        imageList.add(SlideModel(R.drawable.halo, "Halo Infinite"))
        imageList.add(SlideModel(R.drawable.uncharted, "Uncharted 4: A Thief's End"))

        imageSlider.setImageList(imageList)

        return binding.root
        //Initialize the card elements here- for trial

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var gameList = mutableListOf(
            Card(R.drawable.apex, "Apex Legends", "Best battle Royale game", "90%"),
            Card(R.drawable.apex, "Apex Legends", "Best battle Royale game", "90%"),
            Card(R.drawable.apex, "Apex Legends", "Best battle Royale game", "90%"),
            Card(R.drawable.apex, "Apex Legends", "Best battle Royale game", "90%"),
            Card(R.drawable.apex, "Apex Legends", "Best battle Royale game", "90%")
        )


        val adapter = GameAdapter(gameList)
        binding.topRatedRecyclerView.adapter = adapter
        binding.topRatedRecyclerView.layoutManager =
            LinearLayoutManager(this.context, RecyclerView.HORIZONTAL, false)

        binding.playStationRecyclerView.adapter = adapter
        binding.playStationRecyclerView.layoutManager =
            LinearLayoutManager(this.context, RecyclerView.HORIZONTAL, false)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}