
 Select DISTINCT dbo.project.project_name 
 FROM dbo.project
	JOIN dbo.summary ON  
		dbo.project.project_name = dbo.summary.project_name
		JOIN dbo.employee ON 
			dbo.employee.employee_name = dbo.summary.employee_name
			JOIN dbo.department ON dbo.employee.department_name = dbo.department.department_name
				WHERE dbo.department.department_name = 'Human Resource';
				