package sourcecode.instrumentation.instrumentationhelper;

import java.util.UUID;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

public class SourceCodeInstrumentationHelper {
	

	public static String getUUID() {
		 UUID uuid = UUID.randomUUID();
		 return uuid.toString();
	}
	
	public static IProject copyProject(String projectName) throws CoreException {
	    IProgressMonitor monitoring = new NullProgressMonitor();
	    
	    IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
	    IProject project = workspaceRoot.getProject(projectName);
	    IProjectDescription projectDescription = project.getDescription();
	    
	    String copyName = projectName + "_instrumentation";
	    
	    // create clone project in workspace
	    IProjectDescription copyDescription = workspaceRoot.getWorkspace().newProjectDescription(copyName);
	    
	    // copy project files
	    project.copy(copyDescription, true, monitoring);
	    IProject clone = workspaceRoot.getProject(copyName);
	    
	    // copy the project properties
	    copyDescription.setNatureIds(projectDescription.getNatureIds());
	    copyDescription.setReferencedProjects(projectDescription.getReferencedProjects());
	    copyDescription.setDynamicReferences(projectDescription.getDynamicReferences());
	    copyDescription.setBuildSpec(projectDescription.getBuildSpec());
	    copyDescription.setReferencedProjects(projectDescription.getReferencedProjects());
	    clone.setDescription(copyDescription, null);
	    
	    return clone;
	}
	

}
