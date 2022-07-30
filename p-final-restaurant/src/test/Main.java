package test;
import domain.Comanda;
import service.ComandaService;
import service.ConsumibleService;
import service.EmpleadoService;
import service.MenuService;
import service.MesaService;
import service.SalonService;
import domain.Cheff;
import domain.Cocinero;
import domain.Consumible;
import domain.FormadePago;
import domain.Menu;
import domain.Mesa;
import domain.Mozo;
import domain.Salon;

public class Main {

	public static void main(String[] args) {
	
		//inicializacion de servicios...	
	SalonService salonService = new SalonService();
	EmpleadoService empleadoService = new EmpleadoService();
	MesaService mesaService = new MesaService();
	MenuService menuService = new MenuService();
	ConsumibleService consumibleService = new ConsumibleService();
	ComandaService comandaService = new ComandaService();
	
	// creacion de un salon...
	Salon restaurante = SalonHelper.crearRestaurante(salonService);

	// creacion de mesas...
	Mesa mesapara2nro1 = MesaHelper.crearMesax2(mesaService);
	Mesa mesapara2nro2 = MesaHelper.crearMesax2(mesaService);
	Mesa mesapara4nro1 = MesaHelper.crearMesax4(mesaService);
	Mesa mesapara4nro2 = MesaHelper.crearMesax4(mesaService);
	Mesa mesapara6nro1 = MesaHelper.crearMesax6(mesaService);
	Mesa mesapara6nro2 = MesaHelper.crearMesax6(mesaService);
	// agregar mesas al salon...
	salonService.agregarMesa(mesapara2nro1);
	salonService.agregarMesa(mesapara2nro2);
	salonService.agregarMesa(mesapara4nro1);
	salonService.agregarMesa(mesapara4nro2);
	salonService.agregarMesa(mesapara6nro1);
	salonService.agregarMesa(mesapara6nro2);
	
	// creacion de un menu...	
		Menu menu =  MenuHelper.crearMenu(menuService);
	// agregar menu al salon...
		salonService.agregarMenu(menu);
	
		//creacion de consumibles...
	Consumible aguaSinGas = ConsumibleHelper.crearAgua(consumibleService);
	Consumible aguaConGas = ConsumibleHelper.crearAguaConGas(consumibleService);
	Consumible cerveza500cc = ConsumibleHelper.crearCerveza500cc(consumibleService);
	Consumible cocacola600cc = ConsumibleHelper.crearCocacola600cc(consumibleService);
	Consumible vino500cc = ConsumibleHelper.crearVino500cc(consumibleService);
	Consumible vino1000cc = ConsumibleHelper.crearVino1000cc(consumibleService);
	Consumible hamburguesaSimple = ConsumibleHelper.crearHamburguesaSimple(consumibleService);
	Consumible hamburguesaVegie = ConsumibleHelper.crearHamburguesaVegie(consumibleService);
	Consumible hamburguesaCeliaca = ConsumibleHelper.crearHamburguesaCeliaca(consumibleService);
	Consumible fideosConSalsa = ConsumibleHelper.crearFideosConSalsa(consumibleService);
	Consumible fideosConSalsaVegie = ConsumibleHelper.crearFideosConSalsaVegie(consumibleService);
	Consumible fideosConSalsaCeliaca = ConsumibleHelper.crearHamburguesaCeliaca(consumibleService);
	Consumible ensaladaVegana = ConsumibleHelper.crearEnsalada(consumibleService);
	Consumible sushiVegano = ConsumibleHelper.crearSushiVegano(consumibleService);
	
	//agregar consumibles a la lista de consumibles del menu creado.
		
	menuService.agregarConsumible(menu,aguaSinGas);
	menuService.agregarConsumible(menu,aguaConGas);
	menuService.agregarConsumible(menu,cerveza500cc);
	menuService.agregarConsumible(menu,cocacola600cc);
	menuService.agregarConsumible(menu,vino500cc);
	menuService.agregarConsumible(menu,vino1000cc);
	menuService.agregarConsumible(menu,hamburguesaSimple);
	menuService.agregarConsumible(menu,hamburguesaVegie);
	menuService.agregarConsumible(menu,hamburguesaCeliaca);
	menuService.agregarConsumible(menu,fideosConSalsa);
	menuService.agregarConsumible(menu,fideosConSalsaVegie);
	menuService.agregarConsumible(menu,fideosConSalsaCeliaca);
	menuService.agregarConsumible(menu,ensaladaVegana);
	menuService.agregarConsumible(menu,sushiVegano);
	
	// creacion del personal para atender el Salon...
	
	Mozo mozonro1 = EmpleadoHelper.crearMozo1(empleadoService);
	Mozo mozonro2 = EmpleadoHelper.crearMozo2(empleadoService);
	Cocinero cocineronro1 = EmpleadoHelper.crearCocinero1(empleadoService);
	Cocinero cocineronro2 = EmpleadoHelper.crearCocinero2(empleadoService);
	Cheff cheffnro1 = EmpleadoHelper.crearCheff(empleadoService);
	
	// agregar personal al salon...
	
	salonService.agregarEmpleado(mozonro1);
	salonService.agregarEmpleado(mozonro2);
	salonService.agregarEmpleado(cocineronro1);
	salonService.agregarEmpleado(cocineronro2);
	salonService.agregarEmpleado(cheffnro1);
	
	// asignar mesas a los mozos...
	salonService.asignarMesa(mozonro1, mesapara2nro1);
	salonService.asignarMesa(mozonro1, mesapara4nro1);
	salonService.asignarMesa(mozonro1, mesapara6nro1);
	salonService.asignarMesa(mozonro2, mesapara2nro2);
	salonService.asignarMesa(mozonro2, mesapara4nro2);
	salonService.asignarMesa(mozonro2, mesapara6nro2);

	// creacion de comandas y agregado de sus consumibles...
	
	//comanda caso nro1:
	Comanda comandanro1 =  ComandaHelper.crearComanda(comandaService, menu,mesapara2nro1, mozonro1, cocineronro1, FormadePago.EFECTIVO);
	comandaService.agregarConsumibleAlistaComanda(comandanro1, hamburguesaSimple);
	comandaService.agregarConsumibleAlistaComanda(comandanro1, fideosConSalsa);
	comandaService.agregarConsumibleAlistaComanda(comandanro1, aguaSinGas);
	comandaService.agregarConsumibleAlistaComanda(comandanro1, aguaConGas);

	
	//comanda caso nro2:
	Comanda comandanro2 =  ComandaHelper.crearComanda(comandaService, menu, mesapara2nro2, mozonro2, cocineronro2, FormadePago.EFECTIVO);
	comandaService.agregarConsumibleAlistaComanda(comandanro2, fideosConSalsaVegie);
	comandaService.agregarConsumibleAlistaComanda(comandanro2, hamburguesaVegie);
	comandaService.agregarConsumibleAlistaComanda(comandanro2, aguaConGas);
	comandaService.agregarConsumibleAlistaComanda(comandanro2, cocacola600cc);
	
	
	// comanda caso nro3:
	Comanda comandanro3 =  ComandaHelper.crearComanda(comandaService, menu, mesapara4nro1, mozonro1, cocineronro1, FormadePago.TARJETA);
	comandaService.agregarConsumibleAlistaComanda(comandanro3, ensaladaVegana);
	comandaService.agregarConsumibleAlistaComanda(comandanro3, hamburguesaVegie);
	comandaService.agregarConsumibleAlistaComanda(comandanro3, fideosConSalsaCeliaca);
	comandaService.agregarConsumibleAlistaComanda(comandanro3, fideosConSalsa);
	comandaService.agregarConsumibleAlistaComanda(comandanro3, cocacola600cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro3, aguaConGas);
	comandaService.agregarConsumibleAlistaComanda(comandanro3, vino500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro3, cerveza500cc);
	
	// comanda caso nro4:
	Comanda comandanro4 =  ComandaHelper.crearComanda(comandaService, menu, mesapara4nro2, mozonro2, cocineronro2, FormadePago.EFECTIVO);
	comandaService.agregarConsumibleAlistaComanda(comandanro4, ensaladaVegana);
	comandaService.agregarConsumibleAlistaComanda(comandanro4, hamburguesaVegie);
	comandaService.agregarConsumibleAlistaComanda(comandanro4, fideosConSalsaVegie);
	comandaService.agregarConsumibleAlistaComanda(comandanro4, sushiVegano);
	comandaService.agregarConsumibleAlistaComanda(comandanro4, vino500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro4, vino500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro4, vino500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro4, vino500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro4, vino500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro4, cerveza500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro4, cerveza500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro4, cerveza500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro4, cerveza500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro4, cerveza500cc);
	
	// comanda caso nro5:
	Comanda comandanro5 =  ComandaHelper.crearComanda(comandaService, menu, mesapara6nro1, mozonro1, cocineronro1, FormadePago.EFECTIVO);
	comandaService.agregarConsumibleAlistaComanda(comandanro5, fideosConSalsaCeliaca);
	comandaService.agregarConsumibleAlistaComanda(comandanro5, fideosConSalsaCeliaca);
	comandaService.agregarConsumibleAlistaComanda(comandanro5, fideosConSalsaCeliaca);
	comandaService.agregarConsumibleAlistaComanda(comandanro5, hamburguesaCeliaca);
	comandaService.agregarConsumibleAlistaComanda(comandanro5, hamburguesaCeliaca);
	comandaService.agregarConsumibleAlistaComanda(comandanro5, hamburguesaCeliaca);
	comandaService.agregarConsumibleAlistaComanda(comandanro5, hamburguesaCeliaca);
	comandaService.agregarConsumibleAlistaComanda(comandanro5, cerveza500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro5, cerveza500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro5, cerveza500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro5, cerveza500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro5, aguaSinGas);
	comandaService.agregarConsumibleAlistaComanda(comandanro5, aguaConGas);
	
	//comanda caso nro 6
	Comanda comandanro6 =  ComandaHelper.crearComanda(comandaService, menu, mesapara6nro2, mozonro2, cocineronro2, FormadePago.TARJETA);
	comandaService.agregarConsumibleAlistaComanda(comandanro6, fideosConSalsaCeliaca);
	comandaService.agregarConsumibleAlistaComanda(comandanro6, fideosConSalsaCeliaca);
	comandaService.agregarConsumibleAlistaComanda(comandanro6, fideosConSalsaCeliaca);
	comandaService.agregarConsumibleAlistaComanda(comandanro6, hamburguesaCeliaca);
	comandaService.agregarConsumibleAlistaComanda(comandanro6, hamburguesaCeliaca);
	comandaService.agregarConsumibleAlistaComanda(comandanro6, hamburguesaCeliaca);
	comandaService.agregarConsumibleAlistaComanda(comandanro6, hamburguesaCeliaca);
	comandaService.agregarConsumibleAlistaComanda(comandanro6, cerveza500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro6, cerveza500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro6, cerveza500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro6, cerveza500cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro6, aguaSinGas);
	comandaService.agregarConsumibleAlistaComanda(comandanro6, aguaConGas);
	
	// comanda de 2 comenzales con 2 platos y bebidas sin alcohol del escenario nro 9
	Comanda comandanro7 =  ComandaHelper.crearComanda(comandaService, menu,mesapara2nro1, mozonro1, cocineronro1, FormadePago.EFECTIVO);
	comandaService.agregarConsumibleAlistaComanda(comandanro7, hamburguesaSimple);
	comandaService.agregarConsumibleAlistaComanda(comandanro7, fideosConSalsa);
	comandaService.agregarConsumibleAlistaComanda(comandanro7, aguaSinGas);
	comandaService.agregarConsumibleAlistaComanda(comandanro7, aguaConGas);
	
	// comanda del escenario nro 10
	Comanda comandanro8 =  ComandaHelper.crearComanda(comandaService, menu,mesapara4nro2, mozonro2, cheffnro1, FormadePago.EFECTIVO);
	comandaService.agregarConsumibleAlistaComanda(comandanro8, sushiVegano);
	comandaService.agregarConsumibleAlistaComanda(comandanro8, sushiVegano);
	comandaService.agregarConsumibleAlistaComanda(comandanro8, fideosConSalsa);
	comandaService.agregarConsumibleAlistaComanda(comandanro8, fideosConSalsa);
	comandaService.agregarConsumibleAlistaComanda(comandanro8, vino1000cc);
	comandaService.agregarConsumibleAlistaComanda(comandanro8, vino1000cc);
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// Ejecucion de los escenarios de Test:
		System.out.println("*Ejecucion de los escenarios de comanda:*");
		System.out.println("\n");
	//escenario de comanda nro 1:
	System.out.println("Comanda nro1: | Mesa para 2 comensales con 2 platos y bebidas sin alcohol,abono en efectivo.| ");
	System.out.println("<------------------------------------------------------------------------------------------------------------------------->");
	System.out.println("| estado de la mesa: |");
	mesaService.mostrar(mesapara2nro1);
	mesaService.hacerPedidoalMozo(mozonro1, mesapara2nro1, comandanro1, empleadoService);
	comandaService.mostrarComanda(comandanro1);
	System.out.println("| estado de la mesa despues de realizar el pedido: |\n");
	mesaService.mostrar(mesapara2nro1);
	System.out.println("realizamos la liberacion de la mesa:\n");
	mesaService.liberar(mesapara2nro1);
	System.out.println("La mesa fue liberada...\n");
	System.out.println("actualizacion del estado de la mesa:");
	mesaService.mostrar(mesapara2nro1);
	comandaService.calcularTotal(comandanro1);
	System.out.println("\n");
	
	salonService.pedidosConMasConsumibles();
	
	

	

	

	
	
	
	
	
	
	
	

	}
}
