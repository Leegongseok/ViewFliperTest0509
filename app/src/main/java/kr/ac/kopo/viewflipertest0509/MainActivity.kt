package kr.ac.kopo.viewflipertest0509

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ViewFlipper

class MainActivity : AppCompatActivity() {

    lateinit var btnNext: Button
    lateinit var btnPrev: Button
    lateinit var vFlip: ViewFlipper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNext=findViewById<Button>(R.id.btnNext)
        btnPrev=findViewById<Button>(R.id.btnprev)
        vFlip=findViewById<ViewFlipper>(R.id.flipper)

        btnNext.setOnClickListener(btnListener)
        btnPrev.setOnClickListener(btnListener)

        vFlip.setFlipInterval(2000)
    }

    val btnListener= View.OnClickListener {
        when(it.id){
            R.id.btnprev ->vFlip.startFlipping()
            R.id.btnNext->vFlip.stopFlipping()

        }
    }
}