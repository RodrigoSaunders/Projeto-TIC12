package com.example.cardapio

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cardapio.databinding.CardapioBinding
import com.example.cardapio.ui.theme.CardapioTheme

class MainActivity : ComponentActivity() {

    private lateinit var binding: CardapioBinding
    val preco_da_refeicao = 20
    val preco_da_sobremesa = 15
    val preco_da_bebida = 8
    val preco_da_lanche = 12
    val preco_da_entrada = 18

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CardapioBinding.inflate(layoutInflater)
        setContentView(R.layout.cardapio)

        binding.botaoPedido.setOnClickListener{
            val x = Intent(this, Resumo::class.java)
            x.putExtra("Q_Refeicao", binding.opcaorefeicoes.text.toString())
            x.putExtra("Q_Sobremesa", binding.opcaoSobremesa.text.toString())
            x.putExtra("Q_Bebidas", binding.opcaoBebidas.text.toString())
            x.putExtra("Q_Lanches", binding.opcaoLanches.text.toString())
            x.putExtra("Q_Entrada", binding.opcaoEntradas.text.toString())
            x.putExtra("Q_Refeicao", preco_da_lanche)
            x.putExtra("Q_Refeicao", preco_da_sobremesa)
            x.putExtra("Q_Refeicao", preco_da_entrada)
            x.putExtra("Q_Refeicao", preco_da_refeicao)
            x.putExtra("Q_Refeicao", preco_da_bebida)
            startActivity(x)
        }

        binding.opcaoEntradas.setOnClickListener{
            if(binding.opcaoEntradas.isChecked()) {
                binding.precoentrada.visibility = View.VISIBLE

            } else {
                binding.opcaoEntradas.setText("0")
                binding.precoentrada.visibility = View.GONE
            }
        }
        binding.opcaoLanches.setOnClickListener {
            if(binding.opcaoLanches.isChecked()) {
                binding.precoLanches.visibility = View.VISIBLE

            } else {
                binding.opcaoLanches.setText("0")
                binding.precoLanches.visibility = View.GONE
            }
        }
        binding.opcaoBebidas.setOnClickListener{
            if(binding.opcaoBebidas.isChecked()) {
                binding.precoBebidas.visibility = View.VISIBLE

            } else {
                binding.opcaoBebidas.setText("0")
                binding.precoBebidas.visibility = View.GONE
            }

        binding.opcaoSobremesa.setOnClickListener{
            if(binding.opcaoSobremesa.isChecked()) {
                binding.precoSobremesa.visibility = View.VISIBLE

            } else {
                binding.opcaoSobremesa.setText("0")
                binding.precoSobremesa.visibility = View.GONE
            }
        }

    }
}
}