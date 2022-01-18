package com.brian.gamr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.brian.gamr.databinding.FragmentHomeBinding
import com.denzcoskun.imageslider.constants.ScaleTypes
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

        //create an imageList as an array
        val imageSlider = binding.imageSlider
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.uncharted, "Apex Legends"))
        imageList.add(SlideModel(R.drawable.cyberpunk, "Cyberpunk 2077"))
        imageList.add(SlideModel(R.drawable.forza, "Forza Horizon 5"))
        imageList.add(SlideModel(R.drawable.halo, "Halo Infinite"))
        imageList.add(SlideModel(R.drawable.uncharted, "Uncharted 4: A Thief's End"))

        imageSlider.setImageList(imageList)

        return binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}