package jcsiglerp.androidproject.Model;

import java.util.Date;
import java.util.UUID;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Pedido extends RealmObject {
    @PrimaryKey
    public String id = UUID.randomUUID().toString();

    public Usuario usuario;

    public double cantidad;
    public Date fecha;
    RealmList < Prenda > prendas;
}