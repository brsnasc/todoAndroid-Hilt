package com.generation.todoapplication.API

import com.generation.todoapplication.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

interface APIService {

    @GET("categoria")
    suspend fun listCategoria(): Response<List<Categoria>>

}