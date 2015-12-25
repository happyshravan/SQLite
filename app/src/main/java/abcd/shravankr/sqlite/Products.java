package abcd.shravankr.sqlite;

public class Products {
    public int _id;
    public String _productname;

    public Products(){

    }
    public Products(String productname) {
        this._productname = productname;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_productname(String _productname) {
        this._productname = _productname;
    }

    public int get_id() {

        return _id;
    }

    public String get_productname() {

        return _productname;
    }
}
