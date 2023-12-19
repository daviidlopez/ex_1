package com.example.newpedro

import android.os.Parcel
import android.os.Parcelable


class Book(
    private var titulo: String?,
    private var numPaginas: String?,
    private var nombreAutor: String?,
    private var fecha: String?
) : Parcelable {


    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    fun setTitulo(titulo : String) {
        this.titulo = titulo
    }

    fun setNumPaginas(numPaginas : String) {
        this.numPaginas = numPaginas
    }
    fun setNombreAutor(nombreAutor : String) {
        this.nombreAutor = nombreAutor
    }
    fun setFecha(fecha : String) {
        this.fecha = fecha
    }
    fun getNumPaginas() = numPaginas
    fun getNombreAutor() = nombreAutor
    fun getFecha() = fecha
    fun getTitulo() = titulo
    override fun toString() = "Titulo: $titulo" +
            "numPaginas: $numPaginas" +
            "nombre: $nombreAutor" +
            "fecha: $fecha"
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(titulo)
        parcel.writeString(numPaginas)
        parcel.writeString(nombreAutor)
        parcel.writeString(fecha)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Book> {
        override fun createFromParcel(parcel: Parcel): Book {
            return Book(parcel)
        }

        override fun newArray(size: Int): Array<Book?> {
            return arrayOfNulls(size)
        }
    }

}