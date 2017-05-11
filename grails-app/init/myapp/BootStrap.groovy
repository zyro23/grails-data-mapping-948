package myapp

class BootStrap {

    def init = { servletContext ->
        Dummy.findAllWithSql("select * from Dummy", [max: 10])
    }
    def destroy = {
    }
}
