package kr.ac.kumoh.s20161396W0501CardDealer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20161396W0501CardDealer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding //ViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)//ViewBinding
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)//ViewBinding
    }
}