import sys
sys.path.insert(0,'./src')
import unittest
from Tienda import Tienda

class Probar_Tienda(unittest.TestCase):

    def test_prueba_cero( self ):
        t = Tienda()
        t.add_cart(1,2)
        self.assertEqual(380, t.calcular_total())

    def test_prueba_uno( self ):
        t = Tienda()
        t.add_cart(1,3)
        t.add_cart(2,1)
        t.add_cart(3,1)
        self.assertEqual(1054.5, t.calcular_total())
