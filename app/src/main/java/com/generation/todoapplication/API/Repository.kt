package com.generation.todoapplication.API

import com.generation.todoapplication.model.Categoria
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>> {
        return RetrofitInstance.api.listCategoria()
    }

}