<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestión de Nómina</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>

    <header>
        <h1>Gestión de Nómina</h1>
        <nav>
            <ul>
                <li><a href="#empleado">Registrar Empleado</a></li>
                <li><a href="#nomina">Calcular Nómina</a></li>
            </ul>
        </nav>
    </header>

    <main>
        <!-- Formulario para registrar empleado -->
        <section id="empleado">
            <h2>Registrar Empleado</h2>
            <form action="NominaCTO" method="POST">
                <label for="nombre">Nombre:</label>
                <input type="text" id="nombre" name="nombre" required>

                <label for="salarioBasico">Salario Básico:</label>
                <input type="number" id="salarioBasico" name="salarioBasico" step="0.01" required>

                <label for="dias">Días Trabajados:</label>
                <input type="number" id="dias" name="dias" required>

                <button type="submit">Calcular Nómina</button>
            </form>
        </section>

        <!-- Sección de resultados -->
        <section id="nomina">
            <h2>Resultado de Nómina</h2>
            <div id="resultadoNomina">
                <h3>Salario Final</h3>
                <textarea id="txtNomina" rows="5" readonly>
                    <% if (request.getAttribute("salarioFinal") != null) { %>
                        <%= request.getAttribute("salarioFinal") %>
                    <% } else { %>
                        No hay datos aún.
                    <% } %>
                </textarea>
            </div>
        </section>
    </main>

    <footer>
        <p>&copy; 2025 Gestión de Nómina</p>
    </footer>

</body>
</html>
