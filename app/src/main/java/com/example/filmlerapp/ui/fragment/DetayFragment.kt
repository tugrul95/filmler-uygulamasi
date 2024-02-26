package com.example.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.filmlerapp.R
import com.example.filmlerapp.databinding.FragmentAnasayfaBinding
import com.example.filmlerapp.databinding.FragmentDetayBinding
import com.example.filmlerapp.ui.fragment.DetayFragmentArgs


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        // Accessing the arguments using the navArgs delegate
        val args: DetayFragmentArgs by navArgs()
        val film = args.film

        // Now you can access the film object and set your UI accordingly
        binding.toolbarDetay.title = film.ad
        binding.ivFilm.setImageResource(
            resources.getIdentifier(film.resim, "drawable", requireContext().packageName)
        )

        return binding.root
    }
}



